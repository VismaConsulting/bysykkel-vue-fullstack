# bysykkel-vue-fullstack
Fullstack app mot Bysykkel api

# Hvordan kjøre
Lag personlig token på https://developer.oslobysykkel.no.
Legg token i application.yaml
- mvn clean install

Kjør AppStarter i pakken fag/visma/bysykkel/vue/fullstack eller kjør:
- java -jar bysykkel-fullstack-vue.jar

# Lag fat jar for deploying/docker image
Lag en fat jar som inneholder backend og frontend sammen
- mvn clean install   

# Hvordan kjøre kun frontend
Gå inn i "bysykkel-vue-fullstack/src/main/web-app" og kjør: 
- npm run serve
