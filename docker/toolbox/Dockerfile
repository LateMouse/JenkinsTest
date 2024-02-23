FROM ubuntu:20.04
RUN apt-get update && apt-get install -y nginx curl && mkdir -p /app/static
EXPOSE 8080
CMD ["nginx", "-g", "daemon off;"]
