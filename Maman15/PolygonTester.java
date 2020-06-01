public class PolygonTester
{
  public static void main(String[] args) 
    {
        System.out.println("*****Point Tester*****");
               
        Point p1 = new Point(2 ,1);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(7, 5);
        Point p4 = new Point(4, 6);
        Point p5 = new Point(1, 4);
        
        System.out.println("\nisAbove Test:");
        System.out.println( p1.isAbove(p2) ? "Test Passed" : "Test Failed");
        
        System.out.println("\nisUnder Test:");
        System.out.println( p2.isUnder(p1) ? "Test Passed" : "Test Failed");
        
        System.out.println("\nisLeft Test:");
        System.out.println( p1.isLeft(p2) ? "Test Passed" : "Test Failed");
        
        System.out.println("\nisRight Test:");
        System.out.println( p2.isRight(p1) ? "Test Passed" : "Test Failed");
        
        System.out.println("\nequals Test:");
        System.out.println( p1.equals(p1) && !p1.equals(p2) ? "Test Passed" : "Test Failed");
        
        System.out.println("\ntoString Test:");
        System.out.println( p2.toString().equals("(5.0,0.0)") ? "Test Passed" : 
        "Test Failed\nExpected Output: (5.0,0.0)\nYour Output: " + p2.toString());
        
        System.out.println("\ndistance Test:");
        double dis = p1.distance(p2);
        System.out.println( dis == Math.sqrt(10) ? "Test Passed" : 
        "Test Failed\nExpected Output: " + Math.sqrt(10) + "\nYour Output: " + dis);
        
        System.out.println("\nmove Test:");
        p1.move(5, 5);
        System.out.println( p1.getX() == 7 && p1.getY() == 6 ? "Test Passed" : 
        "Test Failed\nExpected Output: X - 7.0, Y - 6.0\nYour Output: X - " + p1.getX() + ", Y - " + p1.getY());
        p1.move(-5, -5);
        
        System.out.println("\n\n\n*****Polygon Tester*****");
        Polygon pol = new Polygon();
        
        System.out.println("\naddVertex Test - Incorrect values:");
        System.out.println(!pol.addVertex(p1, 0) && !pol.addVertex(p1, 10) ? "Test Passed" : 
        "Test Failed, Check position cases.\nWARNING: CAN CAUSE TROUBLE IN THE REST OF THE TESTER");
        
        System.out.println("\naddVertex Test - Correct values:");
        System.out.println(pol.addVertex(p2, 1) && pol.addVertex(p1, 1) && pol.addVertex(p4, 3) && 
        pol.addVertex(p3, 3) && pol.addVertex(p5, 5) ? "Test Passed" : 
        "Test Failed.\nWARNING: CAN CAUSE TROUBLE IN THE REST OF THE TESTER");
        
        System.out.println("\naddVertex and findVertex Test - Correct Positions:");
        System.out.println(pol.findVertex(p1) == 1 && pol.findVertex(p2) == 2 && 
        pol.findVertex(p3) == 3 && pol.findVertex(p4) == 4 && pol.findVertex(p5) == 5 ? 
        "Test Passed" : "Test Failed. Check your addVertex/findVertex Methods\n"
        + "WARNING: CAN CAUSE TROUBLE IN THE REST OF THE TESTER");
        
        System.out.println("\nhighestVertex Test:");
        System.out.println( pol.highestVertex().getY() == 6 ? "Test Passed" : "Test Failed");
        
        System.out.println("\ntoString Test:");
        System.out.println( pol.toString().equals("The polygon has 5 vertices:\n((2.0,1.0),(5.0,0.0),(7.0,5.0),(4.0,6.0),(1.0,4.0))") ? "Test Passed" : "Test Failed\n"
        + "Expected Output:\nThe polygon has 5 vertices:\n((2.0,1.0),(5.0,0.0),(7.0,5.0),(4.0,6.0),(1.0,4.0))\nYour Output:\n" + pol.toString());
        
        System.out.println("\ncalcPerimeter Test:");
        System.out.println( pol.calcPerimeter() == 18.47754906310363 ? "Test Passed" : "Test Failed");
        
        Polygon pol2 = new Polygon();
        pol2.addVertex(p1, 1);
        pol2.addVertex(p2, 2);
        pol2.addVertex(p3, 3);
        System.out.println("\nisBigger Test:");
        System.out.println( pol.isBigger(pol2) ? "Test Passed" : "Test Failed");
        
        System.out.println("\ngetNextVertex Test:");
        System.out.println( pol.getNextVertex(p1).equals(p2) ? "Test Passed" : "Test Failed");
        
        System.out.println("\ngetBoundingBox Test:");
        Polygon boundingBox = pol.getBoundingBox();
        
        Point p6 = new Point(1,0);
        Point p7 = new Point(1,6);
        Point p8 = new Point(7,6);
        Point p9 = new Point(7,0);
        System.out.println( boundingBox.findVertex(p6) != -1 && boundingBox.findVertex(p7) != -1 && boundingBox.findVertex(p8) != -1 && boundingBox.findVertex(p9) != -1 ? "Test Passed" : "Test Failed");
        
        System.out.println("\n\n*****Aliasing Test*****");
        
        System.out.println("\nConstructor Test:");
        Point p10 = new Point(0, 0);
        PointNode pNode1 = new PointNode(p10);
        p10.move(1, 1);
        System.out.println( !p10.equals(pNode1.getPoint()) ? "Test Passed" : "Test Failed");
        p10.move(-1, -1);
        
        System.out.println("\ngetPoint() Test:");        
        p10 = pNode1.getPoint();
        p10.move(1, 1);
        System.out.println( !p10.equals(pNode1.getPoint()) ? "Test Passed" : "Test Failed");
        p10.move(-1, -1);
        
        System.out.println("\nsetPoint() Test:");        
        pNode1.setPoint(p10);
        p10.move(1, 1);
        System.out.println( !p10.equals(pNode1.getPoint()) ? "Test Passed" : "Test Failed");
        p10.move(-1, -1);
        
        System.out.println("\n\n*****More Edge Case Testing*****");
        
        System.out.println("\nEmpty toString Test:");
        Polygon pol3 = new Polygon();
        System.out.println( pol3.toString().equals("The polygon has 0 vertices.") ? "Test Passed" : "Test Failed\n"
        + "Expected Output:\nThe polygon has 0 vertices.\nYour Output:\n" + pol3.toString());
        
        System.out.println("\ngetNextVertex Test - last Vertex:");
        System.out.println(pol.getNextVertex(p5).equals(p1) ? "Test Passed" : "Test Failed");
        
        System.out.println("\ngetBoundingBox Test - less than 3 vertex:");
        System.out.println(pol3.getBoundingBox() == null ? "Test Passed" : "Test Failed");
        
        System.out.println("\nhighestVertex Test - no vertex:");
        System.out.println(pol3.highestVertex() == null ? "Test Passed" : "Test Failed");
        
        System.out.println("\ncalcPerimeter Test - no vertex:");
        System.out.println(pol3.calcPerimeter() == 0 ? "Test Passed" : "Test Failed");
        
        System.out.println("\ncalcArea Test - no vertex:");
        System.out.println(pol3.calcArea() == 0 ? "Test Passed" : "Test Failed");
        
        System.out.println("\nfindVertex Test - no vertex:");
        System.out.println(pol3.findVertex(p1) == -1 ? "Test Passed" : "Test Failed");
        
        System.out.println("\ngetNextVertex Test - no vertex:");
        System.out.println(pol3.getNextVertex(p1) == null ? "Test Passed" : "Test Failed");
        
        System.out.println("\ngetBoundingBox Test - last Vertex:");
        System.out.println(pol3.getBoundingBox() == null ? "Test Passed" : "Test Failed");
        
        Polygon pol4 = new Polygon();
        pol4.addVertex(p1, 1);
        pol4.addVertex(p2, 2);
        System.out.println("\ncalcPerimeter Test - 2 Vertex:");
        System.out.println(pol4.calcPerimeter() == Math.sqrt(10) ? "Test Passed" : "Test Failed");
    }
}
