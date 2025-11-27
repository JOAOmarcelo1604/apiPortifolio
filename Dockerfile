# Etapa 1: Build da aplicação
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar arquivos do Maven
COPY pom.xml .
COPY src ./src

# Compilar o projeto
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final otimizada
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar o JAR compilado
COPY --from=build /app/target/*.jar app.jar

# Expor a porta
EXPOSE 8085

# Variáveis de ambiente (podem ser sobrescritas)
ENV MONGODB_URI=""
ENV PORT=8085

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
