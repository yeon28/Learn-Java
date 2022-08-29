package p05.resticted_generic;

import java.util.Arrays;

public class RestrictedGenericEx {

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
//		workerCourse.add(new Person("일반인"));
//		--> The method add(Worker) in the type Course<Worker> is not applicable for the arguments (Person)
		personCourse.add(new Worker("직장인"));
//		personCourse.add(new Student("학생"));
//		personCourse.add(new HighStudent("고등학생"));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
//		studentCourse.add(new Person("일반인"));
//		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
//		highStudentCourse.add(new Person("일반인"));
//		highStudentCourse.add(new Worker("직장인"));
//		highStudentCourse.add(new Student("학생"));
//		--> The method add(HighStudent) in the type Course<HighStudent> is not applicable for the arguments (Student)
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
//		--> he method registerCourseStudent(Course<? extends Student>) in the type RestrictedGenericEx is not applicable for the 
//		 arguments (Course<Worker>)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
//		--> The method registerCourseWorker(Course<? super Worker>) in the type RestrictedGenericEx is not applicable for the arguments 
//		 (Course<Student>)
	}
	
	
	/*
	 <?>, <? extends A> ,<? super A>
	 메소드나 파라메터의 
	 
	 */
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
}
