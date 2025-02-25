pipeline {
    agent any

    tools {
        maven 'maven3'
    }
    environment {
        DOCKER_CREDENTIALS_ID = 'DockerHubCred'
        IMAGE_NAME = 'gv2002/scientific-calculator'
        IMAGE_TAG = 'latest'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Frost-04/scientific-calculator.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
                sh 'mvn package'
            }
        }

        stage('Docker Build & Push') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKER_CREDENTIALS_ID) {
                        def app = docker.build("${IMAGE_NAME}:${IMAGE_TAG}")
                        app.push()
                    }
                }
            }
        }
        stage('Deploy using Ansible') {
            steps {
                sh '''
                    ansible-playbook -i hosts.ini deploy.yml
                '''
            }
        }
    }
}
