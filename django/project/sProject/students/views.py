from django.http import HttpResponseRedirect
from django.urls import reverse
from django.shortcuts import render
from students.models import Student
 
# def index(request):
#     return render(request, 'index.html')  # index.html 템플릿을 렌더링

def index(request):
    students = Student.objects.all()  # 모든 학생 데이터 조회
    return render(request, 'index.html', {'students': students})



# path('reg/'              , views.regStudent        , name='reg')
def   regStudent(request) : 
  return render(request , 'students/registerStudent.html')

# path('regCon/'           , views.regConStudent     , name='regCon')
def  regConStudent(request) : 
  # parameter
  name = request.POST['name']
  major = request.POST['major']
  age = request.POST['age']
  grade = request.POST['grade'] 
  gender = request.POST['gender'] 
  # db 처리
  qs = Student(s_name=name , s_major=major ,s_age=age , s_grade=grade , s_gender=gender) 
  qs.save() # db
  
  return HttpResponseRedirect(reverse('students:stuAll'))
  
  
# path('all/'              , views.readStudentAll     , name='stuAll') 
def readStudentAll(request) : 
	qs = Student.objects.all()
	context = {'student_list': qs}
	return render(request, 'students/readStudents.html', context)
  


# path('<str:s_name>/det/' , views.detStudent        , name='stuDet') 
def detStudent(request , name):
	qs = Student.objects.get(s_name = name)
	context = {'student_info': qs}
	return render(request, 'students/detailStudent.html', context)
  
  
# path('<str:s_name>/mod/' , views.readStudentOne    , name='stuMod') 
def  readStudentOne(request, name):
	qs = Student.objects.get(s_name = name)
	context = {'student_info': qs}
	return render(request, 'students/modifyStudent.html', context)
  
# path('modCon/'           , views.modConStudent     , name='modCon')
def modConStudent(request) :
	name = request.POST['name']
	major = request.POST['major']
	age = request.POST['age']
	grade = request.POST['grade']
	gender = request.POST['gender']
	
	s_qs = Student.objects.get(s_name=name)
	
	s_qs.s_name = name
	s_qs.s_major = major
	s_qs.s_age = age
	s_qs.s_grade = grade
	s_qs.s_gender = gender
	
	s_qs.save()
	
	return HttpResponseRedirect(reverse('students:stuAll'))
 
  

# path('<str:s_name>/del/' , views.delConStudent     , name='stuDel') 

def delConStudent(request, name):
	qs = Student.objects.get(s_name = name)
	qs.delete()
	
	return HttpResponseRedirect(reverse('students:stuAll'))