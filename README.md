# maze-app


=========================================

Given a maze with the following structure

###########
S #   #   #
# # # # # #
#   #   # #
######### #
# #       #
# # #######
# #   #   #
# # # ### #
#   #     F
###########

Please write a program that can solve the maze. The blank characters 
represent empty space and the hash character (#) represents a wall.

The cursor is unable to travel through a wall, but is able to travel
in blank space.

The cursor must start on the S character and is not finished until it
lands on the F character.

The program should take one parameter, the maze in text format and
should print the solved maze upon completion and exit.
