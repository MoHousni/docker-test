pipeline {
  agent any
  stages{
    stage('build'){
      steps{
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('SonarQube-analyse'){
      steps{
        withSonarQubeEnv('sonar') {
          bat 'mvn sonar:sonar'
        }
      }
    }
    stage('Email-Notification'){
      steps{
        mail bcc: '', body: 'Hello and see you later', cc: '', from: '', replyTo: '', subject: 'email for jenkins test pipeline', to: 'mohamedhousni1996@gmail.com'
      }
  }
}
}
