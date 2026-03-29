# Spring Boot Supervision & Journalisation

## 📖 Description
Ce projet est une application Spring Boot démontrant la supervision et la journalisation avancée. Il expose des métriques au format Prometheus via `/actuator/prometheus` et peut être monitoré par un stack Prometheus/Grafana.

## 🚀 Fonctionnalités
- Exposition de métriques HTTP (taux de requêtes, durée, statuts).
- Métriques JVM (mémoire, CPU, threads).
- Intégration avec Prometheus pour le scraping.
- Dashboard Grafana personnalisé pour la visualisation.

## 🛠️ Stack technique
- Java 17+
- Spring Boot 3.x
- Micrometer (Prometheus registry)
- Spring Actuator
- Prometheus
- Grafana

## ⚙️ Configuration requise
- Docker (optionnel pour Prometheus/Grafana)
- Maven
- Port 8080 pour l'application Spring Boot

## 🔧 Installation et exécution

### 1. Cloner le dépôt

- git clone https://github.com/IlyassOubaba/Spring_Supervision_Journalisation.git
- cd Spring_Supervision_Journalisation 

---

### 2. Lancer l'application Spring Boot
**mvn spring-boot:run**
- L'application sera accessible sur http://localhost:8080
- Les métriques Prometheus sont sur http://localhost:8080/actuator/prometheus.

---

 ## Configuration prometheuse
 ```bash
global:
  scrape_interval: 5s

scrape_configs:
  - job_name: 'spring-boot-app'
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['localhost:8080']
```
---

## Lancement de prometheuse par la commande : **./prometheus --config.file=prometheus.yml**

---

## Configuration de Grafana
-Ajoutez Prometheus comme datasource : http://localhost:9090
-Importez le dashboard JSON fourni dans le dossier /grafana

##  Dashboard Grafana

Le dashboard inclus visualise :

Statut de l'application (UP/DOWN)

Taux de requêtes HTTP par endpoint

Utilisation mémoire JVM (heap)

Usage CPU système et process

Alertes actives

# Video Demo


https://github.com/user-attachments/assets/afb9f1ff-ab52-4562-a2b5-905563eb6616


