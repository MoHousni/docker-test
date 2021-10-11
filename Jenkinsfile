pipeline {
  agent any
  stages{
    stage('SCM checkout'){
      steps{
        git 'https://github.com/MoHousni/docker-test'
      }
    }
    stage('build'){
      steps{
        sh 'mvn package'
      }
    }
  }
}
