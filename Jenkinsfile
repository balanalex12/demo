pipeline {
    agent any

    stages {
        stage('Clean and clone repository') {
            steps {
                sh 'docker stop $(docker ps -a -q  --filter ancestor=demo)|| exit 0;'
                sh 'docker rm $(docker ps -a -q  --filter ancestor=demo)|| exit 0;'
                sh 'docker rmi demo|| exit 0;'
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/balanalex12/demo.git'

            }
        }

        stage("Build"){
            steps{
                sh "chmod +x mvnw"
                sh "./mvnw clean install"
            }
        }

        stage("Deploy"){
            steps{
                sh "docker build -t demo ."
                sh "docker run -dp 8082:8080 demo"
            }
        }
    }
}
