from django.urls import path
from . import views

app_name = 'students'
urlpatterns = [
    path('reg/'              , views.regStudent      , name='reg'),
    path('regCon/'           , views.regConStudent   , name='regCon'),
    path('all/'              , views.readStudentAll  , name='stuAll'),
    path('<str:name>/det/'   , views.detStudent      , name='stuDet'),    
    path('<str:name>/mod/'   , views.readStudentOne  , name='stuMod'),    
    path('modCon/'           , views.modConStudent   , name='modCon'),
    path('<str:name>/del/'   , views.delConStudent   , name='stuDel')     
]
