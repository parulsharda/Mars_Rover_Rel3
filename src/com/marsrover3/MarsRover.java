package com.marsrover3;


    public class MarsRover {
        private int xCoordinate;
        private int yCoordinate;
        private char direction;

        public MarsRover(int xCoordinate, int yCoordinate, char direction) {
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
            this.direction = direction;
        }

        public MarsRover navigateTo(String instruction) {
            for (int i = 0; i < instruction.length(); i++) {
                if (instruction.charAt(i) == 'L')
                    moveLeft();
                else if (instruction.charAt(i) == 'R')
                    moveRight();
                else if (instruction.charAt(i) == 'M')
                    moveForward();
            }
            return this;
        }

        private void moveForward() {
            if (direction == 'N')
                yCoordinate += 1;
            else if (direction == 'S')
                yCoordinate -= 1;
            else if (direction == 'E')
                xCoordinate += 1;
            else if (direction == 'W')
                xCoordinate -= 1;
        }

        private void moveRight() {
            if (direction == 'W')
                direction = 'N';
            else if (direction == 'S')
                direction = 'W';
            else if (direction == 'E')
                direction = 'S';
            else if (direction == 'N')
                direction = 'E';
        }

        private void moveLeft() {
            if (direction == 'E')
                direction = 'N';
            else if (direction == 'N')
                direction = 'W';
            else if (direction == 'W')
                direction = 'S';
            else if (direction == 'S')
                direction = 'E';
        }

        @Override
        public boolean equals(Object that) {
            if (this == that) return true;
            if (that == null || getClass() != that.getClass()) return false;

            MarsRover rover = (MarsRover) that;

            if (xCoordinate != rover.xCoordinate) return false;
            if (yCoordinate != rover.yCoordinate) return false;
            return direction == rover.direction;

        }

        @Override
        public int hashCode() {
            int result = xCoordinate;
            result = 31 * result + yCoordinate;
            result = 31 * result + (int) direction;
            return result;
        }

        @Override
        public String toString() {
            return xCoordinate + " " + yCoordinate + " " + direction;
        }
    }

