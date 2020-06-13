import math
import requests
import time
import pandas as pan 
from pandas import DataFrame
def continent():
    ctyname = [0]*2000
    zhname = [0]*2000
    destnum = [0]*2000
    orignum = [0]*2000
    # hospital = [0]*2000
    continentoutcount = [0]*6
    continentincount = [0]*6
    flag = [0]*232
    error = 0
    success = 0
    x = pan.read_excel('各大洲国家19版.xlsx' ) #encoding="gbk"
    oricountry = pan.read_excel('各国每年移民数量处理/country_count/19.xlsx', encoding="gbk") 
    txt = open("./continent.txt",mode='w',encoding='UTF-8')
    # print(oricountry.iloc[2,3])
    # print(x.iloc[57,3])
    for i in range(oricountry.index.size):
      for p in range(x.index.size):
        for q in range(6): # 6大洲
          if(oricountry.iloc[i,2] == x.iloc[p,q]):
            continentoutcount[q] = continentoutcount[q] + oricountry.iloc[i,5]
            #continentincount[q] = continentincount[q] + oricountry.iloc[i,1]
            success = success + 1
            flag[i] = 1
            break
            print(oricountry.iloc[i,2]) 
           
    for i in range(232):
      if flag[i] != 1:
        print(i)
    print(continentoutcount)
    #print(continentincount)
    print(x.index.size)
    print(success)
   
continent() 