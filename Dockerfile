FROM clojure:temurin-23-tools-deps-1.12.0.1495-alpine AS build

RUN apk add --update \
  && apk add rlwrap

WORKDIR /app
COPY deps.edn /app
RUN clj -X:deps prep :aliases '[:test :repl]'

COPY . /app

CMD ["clj", "-M:test"]
