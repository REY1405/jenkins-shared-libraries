def call(String user, String projectname, String tag){
    echo "This is building the code"
    sh "docker build -t ${user}/${projectname}:${tag} ." 
    echo "code building completed"
} 