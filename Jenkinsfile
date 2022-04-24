pipeline {
    agent any
stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean install package -DskipTests'
                sh 'pwd'
                sh 'ls'
                sh 'docker version'
                sh 'docker build -t mytest:113 .'

                }
        }
        stage('Test') {
            steps {
                echo 'Testing..'}
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'}
        }
    }
}

