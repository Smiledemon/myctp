#!/usr/bin/env bash


serverLogin="pan@111.231.216.194"
port=22
localFolder="$PWD"

rsync -avz -e "ssh -p ${port} ${serverLogin}" --progress ${localFolder}/out/artifacts :~/myctp
rsync -avz -e "ssh -p ${port} ${serverLogin}" --progress ${localFolder}/lib :~/myctp