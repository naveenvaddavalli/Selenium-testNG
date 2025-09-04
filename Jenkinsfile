pipeline {
    agent any

    tools {
        maven 'Maven -3.9.11'    // name of Maven tool installed in Jenkins (configure in Jenkins > Global Tool Config)
        jdk 'Java'        // name of JDK configured in Jenkins
    }
    triggers {
          githubPush() // Trigger build on GitHub push events
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'push',
                    url: 'https://github.com/naveenvaddavalli/cypress_vscode.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                junit '**/target/surefire-reports/*.xml' // collecting TestNG/JUnit XML reports
                archiveArtifacts artifacts: 'target/surefire-reports/**', fingerprint: true
            }
        }
    }
    post {
        always {
            echo 'This will always run after the stages are finished.'
        }
        success {
            echo 'This will run only if the pipeline succeeds.'
        }
        failure {
            echo 'This will run only if the pipeline fails.'
        }
    }
}



