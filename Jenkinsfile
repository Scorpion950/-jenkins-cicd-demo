
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Cloning GitHub Repository...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Starting Build...'

                sh 'mkdir -p build'
                sh 'javac -d build Main.java MainTest.java'

                echo 'Build Successful!'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Tests...'

                sh 'java -cp build Main'
                sh 'java -cp build MainTest'

                echo 'All Tests Passed!'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESSFUL!'
        }

        failure {
            echo 'BUILD FAILED!'
        }

        always {
            echo 'Pipeline Execution Completed!'
        }
    }
}
