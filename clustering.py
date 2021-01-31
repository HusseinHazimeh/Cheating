#!/usr/bin/env python
# coding: utf-8

# In[15]:


from sklearn.cluster import DBSCAN
from sklearn.cluster import KMeans
from sklearn.cluster import MeanShift
import csv
import numpy as np
import pandas as pd


# In[2]:


df = pd.read_excel('C:/Users/Hussein/Documents/cheating.xls')

"""
X = np.array([ 
            [1,2,3,4,0,123311244126673224],
            [1,2,3,4,0,599283748348574587],
            [1,2,1,2,0,598298745987234987],
            [1,2,4,3,1,945689734598745689],
            [3,2,4,1,1,232498745987345987],
            [3,2,4,1,1,123983459839843589],
            [1,2,3,4,0,121398734897584875]
            ])
 
"""
training_data = pd.read_excel("C:/Users/Hussein/Documents/cheating.xls")
 
X  = training_data.as_matrix()
X


# In[14]:


#dbscan = DBSCAN(eps =   3, min_samples = 5)
#kmeans = KMeans(n_clusters=3, random_state=0).fit(X)
bandwidth = np.array([1.0, 1.2, 1.3, 1.5, 1.7, 1.8, 2.0], dtype=float)

clustering = []

j = 0
for i in bandwidth:
    
    clustering[j] = MeanShift(bandwidth = bandwidth[i]).fit(X)
    j = j + 1


# In[55]:


#model = dbscan.fit(X)
#kmeans.labels_
clustering.labels_


# In[150]:


#print(model.labels_)
clustering.predict([[50, 20, 30, 40]])


# In[ ]:




