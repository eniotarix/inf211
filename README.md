# Docker pour le projet INF211 maintenu par Respons'Traquenard 2023

## Constitution du dépot

Code java à développer : `./dev`

Fichiers nécéssaires pour Docker : `./docker`

Script à lancer pour réaliser les différentes opérations : `./scripts`

## Containers

### Container contenant la base de données

Nom : `db`

Hostname : `serv_postgres`

Port interne : `5432`

Port externe : `5432`

### Container portant pgadmin4

Nom : `pgadmin4`

Hostname : `pgadmin4`

Port interne : `80`

Port externe : `8081`

### Container portant Wildfly

Nom : `wildfly`

Hostname : `wildfly-serv`

Port interne (site dev) : `8080`

Port externe (site dev) : `8080`

Port interne (site admin) : `9990`

Port externe (site admin) : `9990`

### Container portant maven

Nom : `maven`

Hostname : `maven`

## Utilisation

Remplacer les IPs dans les `pom.xml`.

### Base

Se rendre sur son ancien projet puis `docker-compose down -v`.

Placer son code dans `/dev`.

Se rendre dans `./docker` puis lancer un `docker-compose up -d --build` pour forcer le build des containers.

Lancer l'un des scripts présents dans `./scripts` en fonction du besoin.

### Différents scripts sont disponibles dans le dossier `./scripts` pour réaliser les opérations nécessaires :

clean-install.sh équivalent de : `mvn clean install`

hbm2dao.sh équivalent de : `mvn hibernate-tools:hbm2dao`

hbm2java.sh équivalent de : `mvn hibernate-tools:hbm2java`

wildfly-deploy.sh équivalent de : `mvn wildfly:deploy`

wildfly-undeploy.sh équivalent de : `mvn wildfly:undeploy`

Si pgadmin4 ne démarre pas, commenter la ligne `./sources/pgadmin4/storage:/var/lib/pgadmin/storage` dans `./docker/docker-compose.yml`

## En cas de problème, contactez-moi (prix : une bière). Bisous
