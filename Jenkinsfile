pipeline {
    agent any
stages {
 stage('Deploy dev') {

         agent {
           kubernetes {
                 containerTemplate {
                   name 'helm'
                   image 'lachlanevenson/k8s-helm:v3.1.1'
                   ttyEnabled true
                   command 'cat'
              }
            }
         }

            steps {
               container('helm') {
                 sh "helm upgrade full-cover ./helm"
               }
             }
        }
        stage('Build') {
            steps {
                echo 'Building..'}
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
