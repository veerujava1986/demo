pipeline {
    agent any
stages {
 stage('Deploy dev') {

         agent {
           any {
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
                 echo 'Building..XXXXXxxxxxxxxxxxxx'
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
