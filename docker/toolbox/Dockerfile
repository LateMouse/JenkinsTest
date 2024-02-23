FROM ubuntu:20.04
RUN apt-get update && apt-get install -y nginx curl && mkdir -p /app/static
CMD ["nginx", "-g", "daemon off;"]
