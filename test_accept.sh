#!/bin/bash
test $(curl localhost:8083/sum?a=1\&b=2) -eq 3