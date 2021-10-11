pipeline {
  agent any
  stages{
    stage('SCM checkout'){
      steps{
        git 'https://github.com/MoHousni/docker-test.git'
      }
    }
    stage('build'){
      steps{
        sh 'mvn package'
      }
    }
  }
}
