node{
    stage("Pull Repo"){
        git 'git@github.com:farrukh90/meetup_resources.git'
    }
    stage("Build Image"){
        sh "packer build r1soft_server.json --var-file=values.json"
    }
}