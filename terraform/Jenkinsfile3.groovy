node {
    stage("Clone a repo"){
        git 'https://github.com/farrukh90/meetup_resources.git'
    }
    stage("Initialization"){
        dir('/terraform')
            sh "terraform get"
            sh "terraform init"
    }
    stage("Terraform Plan"){
        sh "terraform plan -var-file=instance.tfvars"
    }
}