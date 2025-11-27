#!/bin/bash

echo "🚀 Iniciando deploy..."

# Parar containers antigos
echo "📦 Parando containers antigos..."
docker-compose down

# Remover imagens antigas (opcional)
echo "🗑️ Removendo imagens antigas..."
docker image prune -f

# Build da nova imagem
echo "🔨 Building nova imagem..."
docker-compose build --no-cache

# Iniciar containers
echo "▶️ Iniciando containers..."
docker-compose up -d

# Mostrar logs
echo "📋 Logs da aplicação:"
docker-compose logs -f