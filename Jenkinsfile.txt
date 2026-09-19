pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This pulls your latest code from the GitHub repo
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiling the Java program...'
                sh 'javac Main.java'
            }
        }
        stage('Run') {
            steps {
                echo 'Running the Java program...'
                sh 'java Main'
            }
        }
    }
}
