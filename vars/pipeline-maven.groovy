def call() {
pipeline {
    agent{
        label 'maven'
    }
    stages {
        stage('Build') {
            steps {
                build()
            }
        }
        stage('Test') {
            steps {
                test()
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}