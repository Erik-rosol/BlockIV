pipeline{
    agent any


    stages{
        stage('Clone')
        {
          steps  {
                echo 'Cloning the Repo'
                git branch: 'main', url: 'https://github.com/Erik-rosol/BlockIV.git'
            }
          }
        stage('Build')
        {
                steps {
                    script{
                        setGitHubPullRequestStatus context: 'Build', state: "PENDING"
                        echo 'Building the project...'
                        sh 'mvn clean package -DskipTests=true'
                        setGitHubPullRequestStatus context: 'Build', state: "SUCCESS"
                        }
                   }
                }
        stage('Test')
        {
            steps{
                script{
                    setGitHubPullRequestStatus context: 'Test', state: "PENDING"
                    echo 'Running test'
                    sh 'mvn test -e'
                    setGitHubPullRequestStatus context: 'Test', state: "SUCCESS"
                }
            }
        }
    }
post{
    failure{
        setGitHubPullRequestStatus context: 'The_automate_job', state: 'FAILURE'
        }
    success{
        setGitHubPullRequestStatus context: 'The_automate_job', state: 'SUCCESS'
        }
    }
}