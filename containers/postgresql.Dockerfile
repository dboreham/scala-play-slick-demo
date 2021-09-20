FROM postgres:13.4

RUN apt-get update \
  && apt-get -y install \
    gnupg2 \
    wget \
    lsb-release \
  && apt-get clean all \
  && rm -rf /var/lib/apt/lists/*
