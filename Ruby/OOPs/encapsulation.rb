# class ENCAPSULATION
#   def initialize(roll_no, name)
#     @roll_no = roll_no
#     @name = name
#     @is_enrolled = false
#   end

#   # Setter
#   def enroll
#     @is_enrolled = true
#   end

#   # Getter
#   def is_enrolled?
#     @is_enrolled
#   end

#   # Getter
#   def name
#     @name
#   end

#   # Getter
#   def roll_no
#     @roll_no
#   end
# end
# obj = ENCAPSULATION.new(121,"Swetha")
# obj.enroll
# p obj.is_enrolled?
# p obj.name
# p obj.roll_no
# class Course
#   def initialize(name, students)
#     @name = name
#     @students = students
#   end

#   def students
#     @students
#   end

#   def students=(s)
#     @students = s
#   end
# end

# c = Course.new("SaaS", ["A", "B"])
# p c.students = c.students.concat(["X", "Y"])
class Course
  def initialize(name, students)
    @name = name
    @students = students
  end

  def add_student(student)
    @students.push(student)
  end
end

c = Course.new("SaaS", ["A", "B"])
p c.add_student("X")
p c.add_student("Y")
