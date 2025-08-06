# Spring Boot + Keycloak SSO

## 🔐 Keycloak Setup

### 1. Run Keycloak (Docker)

```bash
docker run -p 8080:8080 \
  -e KEYCLOAK_ADMIN=admin \
  -e KEYCLOAK_ADMIN_PASSWORD=admin \
  quay.io/keycloak/keycloak:24.0.3 start-dev