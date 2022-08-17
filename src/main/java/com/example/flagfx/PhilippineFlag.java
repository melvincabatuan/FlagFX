package com.example.flagfx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PhilippineFlag {

        private final Canvas canvas;
        private GraphicsContext flag;
        int CANVAS_HEIGHT;
        int CANVAS_WIDTH;
        int width;
        int length;
        double[] points_x;
        double[] points_y;

        PhilippineFlag(int CANVAS_WIDTH, int CANVAS_HEIGHT){
            canvas = new Canvas(CANVAS_WIDTH,CANVAS_HEIGHT);
            this.CANVAS_HEIGHT = CANVAS_HEIGHT;
            this.CANVAS_WIDTH = CANVAS_WIDTH;
        }


        public Canvas getFlag(int width, int length, int location_x, int location_y){

            this.width = width;
            this.length = length;

            flag = canvas.getGraphicsContext2D();
            flag.setFill(Color.BLUE);
            flag.fillRect(location_x, location_y, width, length/2.0);
            flag.setFill(Color.RED);
            flag.fillRect(location_x, location_y + length/2.0, width, length/2.0);
            flag.setFill(Color.WHITE);
            flag.fillPolygon(new double[]{location_x,location_x + (width/2.0 - width/12.0),location_x},
                    new double[]{location_y,location_y + length/2.0, location_y + length}, 3);

            init_star(location_x, location_y);

            double size = width/12.0;
            double sun_center_x = location_x + width/8.0;
            double sun_center_y = location_y + length/2.0 - size/2.0;

            flag.fillOval(sun_center_x, sun_center_y, size, size);
            flag.fillRect(sun_center_x - size/2.0, sun_center_y + size/2.0, size * 2.0, size /12.0);
            flag.fillRect(sun_center_x + size/2.0, sun_center_y - size/2.0, size /12.0, size * 2.0);

            points_x = new double[]{sun_center_x-size/4.5,sun_center_x-size/5.0,
                    sun_center_x + size/12.0 + size * 1.15,
                    sun_center_x + size/20.0 + size * 1.15};
            points_y = new double[]{sun_center_y-size/10.0,sun_center_y-size/7.0,
                    sun_center_y - size/12.0 + size * 1.20,
                    sun_center_y - size/20.0 + size * 1.20};

            flag.fillPolygon(points_x, points_y, 4);

            sun_center_y = sun_center_y + size;

            points_x = new double[]{sun_center_x-size/4.5,sun_center_x-size/5.0,
                    sun_center_x + size/12.0 + size * 1.15,
                    sun_center_x + size/20.0 + size * 1.15};
            points_y = new double[]{sun_center_y+size/10.0,sun_center_y+size/7.0,
                    sun_center_y + size/12.0 - size * 1.20,
                    sun_center_y + size/20.0 - size * 1.20};

            flag.fillPolygon(points_x, points_y, 4);

            return canvas;
        }

        public void init_star(double x, double y){

            double size = length/800.0;

            points_x = new double[]{42, 52, 75, 55, 60, 40, 15, 28, 9, 35, 42};
            points_y = new double[]{38, 62, 60, 75, 100, 85, 102, 75, 58, 60, 38};

            create_star(size,x,y);

            points_x = new double[]{42, 52, 75, 55, 60, 40, 15, 28, 9, 35, 42};
            points_y = new double[]{38, 62, 60, 75, 100, 85, 102, 75, 58, 60, 38};

            create_star(size,x,y + length - length/5.0);

            points_x = new double[]{42, 52, 75, 55, 60, 40, 15, 28, 9, 35, 42};
            points_y = new double[]{38, 62, 60, 75, 100, 85, 102, 75, 58, 60, 38};

            x = x + width/2.0 - width/6.0;
            y = y + length/2.0 - length/11.0;

            create_star(size,x,y);

        }

        public void create_star(double size, double x, double y){
            for(int i = 0; i < 11; i++){
                points_x[i] = points_x[i] * size + x;
                points_y[i] = points_y[i] * size + y;
            }
            flag.setFill(Color.ORANGE);
            flag.fillPolygon(points_x, points_y, 11);
        }


}
