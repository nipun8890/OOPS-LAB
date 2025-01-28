package Basics;

public class basic2 {

}
class DayOfWeek:
    def __init__(self, day_number):
        self.day_number = day_number
        self.days = {
            1: "Monday",
            2: "Tuesday",
            3: "Wednesday",
            4: "Thursday",
            5: "Friday",
            6: "Saturday",
            7: "Sunday"
        }

    def get_day(self):
        return self.days.get(self.day_number, "Invalid input. Please enter a number between 1 and 7.")

# Main program
try:
    day_number = int(input("Enter a number (1-7) to get the corresponding day of the week: "))
    day = DayOfWeek(day_number)
    print(day.get_day())
except ValueError:
    print("Invalid input. Please enter a valid number.")
