from ubuntu-jdk
run curl -G https://dlcdn.apache.org/axis/axis2/java/core/1.8.0/axis2-1.8.0-bin.zip -o /opt/axis2.zip
run unzip /opt/axis2.zip -d /opt
# apartir de aqui van mis variables de entorno
env AXIS2_HOME=/opt/axis2-1.8.0
env PATH=$PATH:$AXIS2_HOME/bin
env JAVA_HOME=/usr/lib/jvm/java=1.8.0=openjdk=amd64
workdir /ws
copy calculadora.java .
copy services.xml META-INF/
EXPOSE 8080
