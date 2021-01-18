#!/bin/bash

search_path='dbname=postgresdb user=postgres options=--search_path='
search_path="${search_path}${1}"

docker exec -it postgres psql 'dbname=postgresdb user=postgres options=--search_path=providers'