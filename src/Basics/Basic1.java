package Basics;

public class Basic1 {

}
class Student:
    def __init__(self, nam
        self.name = name
        self.subjects = []

    def add_marks(self, marks):
        if len(self.subjects) < 3:
            self.subjects.append(marks)
        else:
            print("Only three subject marks can be added.")

    def calculate_average(self):
        if len(self.subjects) < 3:
            print("Please enter marks for all three subjects.")
            return None
         return sum(self.subjects) / len(self.subjects)

    def  determine_grade(self):
        average = self.calculate_average()
        if average is None:
            return "Incomplete data, cannot calculate grade."
        
        if average >= 90:
            return "A"
        elif average >= 75:
            return "B"
        elif average >= 50:
            return "C"
        else:
            return "F"

    def display_result(self):
        average = self.calculate_average()
        if average is not None:
            grade = self.determine_grade()
            print(f"Student: {self.name}")
            print(f"Average Marks: {average:.2f}")
            print(f"Grade: {grade}")

