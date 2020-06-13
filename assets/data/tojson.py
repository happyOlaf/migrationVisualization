import math
import requests
import time
import pandas as pan 
from pandas import DataFrame
def addjson():
    name = [0]*2000
    zhname = [0]*2000
    destnum = [0]*2000
    orignum = [0]*2000
    # hospital = [0]*2000
    lon = [0]*2000
    lat = [0]*2000

    x = pan.read_csv('cor.csv', encoding="gbk") 
    txt = open("./migrant_2019.json",mode='w',encoding='UTF-8')
    
    for i in range(x.index.size):
      name[i] = x.iloc[i,0]
      zhname[i] = x.iloc[i,4]
      destnum[i] = x.iloc[i,17]
      orignum[i] = x.iloc[i,18]
      lon[i] = x.iloc[i,2]
      lat[i] = x.iloc[i,3]
    
    print(lon[5], lat[5])
    print(x.index.size)


    #url = 'http://api.map.baidu.com/geocoder/v2/?address=%s&output=json&ak=你的秘钥&callback=showLocation' % (addr)
    #url = 'http://api.map.baidu.com/geoconv/v1/?coords=13379236.4,3446998.2&from=2&to=5&ak=1XjLLEhZhQNUzd93EjU5nOGQ'
    for i in range(x.index.size):
      word = []
      word = '{ "type": "Feature", "properties": { "name": "' + str(name[i]) + '", ' \
       + '"zhname": "' + str(zhname[i]) + '", ' + '"destnum": ' + str(destnum[i]) + ', "orignum": ' + str(orignum[i]) + '},\
      "geometry": { "type": "Point", "coordinates": [' + str(lon[i]) + ',' + str(lat[i]) + ',0.0 ] } },'
      
      hhh = 'h'
      txt.writelines(word + '\n')
      print(word)
addjson() 