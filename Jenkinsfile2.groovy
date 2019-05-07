node{
    stage("Repo Clone"){
        git 'git@github.com:farrukh90/meetup_resources.git'
    }
    stage("Build Image"){
        sh "packer build -var-file=values.json flaskapp.json"
    }
}