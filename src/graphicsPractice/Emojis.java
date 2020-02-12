package graphicsPractice;

import comp127graphics.*;

import java.awt.Color;

@SuppressWarnings("WeakerAccess")
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B),
        EYE_COLOR = new Color(0x070303),
        IRIS_COLOR = new Color(0x2424E4),
        EYE2_COLOR = new Color(0xFFFDFBFF);

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleSmiley = createSmileyFace(100);
        littleSmiley.setPosition(50, 400);
        canvas.add(littleSmiley);

        GraphicsGroup mediumSmiley = createSmileyFace(200);
        mediumSmiley.setPosition(150, 300);
        canvas.add(mediumSmiley);

        GraphicsGroup bigSmiley = createSmileyFace(300);
        bigSmiley.setPosition(350, 200);
        canvas.add(bigSmiley);

        CanvasWindow canvas2 = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleWinky = createWinkingFace(100);
        littleWinky.setPosition(50, 400);
        canvas2.add(littleWinky);

        GraphicsGroup mediumWinky = createWinkingFace(200);
        mediumWinky.setPosition(150, 300);
        canvas2.add(mediumWinky);

        GraphicsGroup bigWinky = createWinkingFace(300);
        bigWinky.setPosition(350, 200);
        canvas2.add(bigWinky);

        CanvasWindow canvas3 = new CanvasWindow("Emoji", 800, 600);

        GraphicsGroup littleFrowny = createFrownyFace(100);
        littleFrowny.setPosition(50, 400);
        canvas3.add(littleFrowny);

        GraphicsGroup mediumFrowny = createFrownyFace(200);
        mediumFrowny.setPosition(150, 300);
        canvas3.add(mediumFrowny);

        GraphicsGroup bigFrowny = createFrownyFace(300);
        bigFrowny.setPosition(350, 200);
        canvas3.add(bigFrowny);
    }

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        GraphicsGroup leftEye = createEye(size*0.1);
        leftEye.setCenter(size*0.35,size*0.35);
        group.add(leftEye);

        GraphicsGroup rightEye = createEye(size*.1);
        rightEye.setCenter(size*0.65,size*.35);
        group.add(rightEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }
    public static GraphicsGroup createWinkingFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes
        GraphicsGroup leftEye = createEye(size*0.1);
        leftEye.setCenter(size*0.35,size*0.35);
        group.add(leftEye);

        Line rightEye = createWink(size*0.1);
        rightEye.setCenter(size*.65,size*.35);
        group.add(rightEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }
    public static GraphicsGroup createFrownyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        // TODO: create eyes
        GraphicsGroup leftEye = createEye(size*0.1);
        leftEye.setCenter(size*0.35,size*0.35);
        group.add(leftEye);

        GraphicsGroup rightEye = createEye(size*0.1);
        rightEye.setCenter(size*.65,size*.35);
        group.add(rightEye);

        Arc mouth = createFrown(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }
    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }
    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, -200, -140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }
    private static GraphicsGroup createEye( double size) {
        Ellipse eye = new Ellipse(0,0,size,size);
        eye.setFillColor(EYE_COLOR);
        eye.setStrokeColor(IRIS_COLOR);
        eye.setStrokeWidth(2);
        Ellipse eye2 = new Ellipse(0,0,size*.5,size*.5);
        eye2.setFillColor(EYE2_COLOR);
        GraphicsGroup wholeEye = new GraphicsGroup();
        wholeEye.add(eye);
        wholeEye.add(eye2);
        return wholeEye;
    }
    private static Line createWink(double size) {
        Line wink = new Line(0,0,size,0);
        wink.setStrokeColor(EYE_COLOR);
        wink.setStrokeWidth(4);
        return wink;
    }
}
