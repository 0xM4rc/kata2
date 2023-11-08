package src.software.ulpgc.kata2;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import java.util.Map.Entry;

public class HistogramRepresentation implements GraphicalRepresentation {

    private Map<String, Integer> data;

    public HistogramRepresentation(Map<String, Integer> data) {
        this.data = data;
    }

    @Override
    public void show() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Histogram Representation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new HistogramPanel(data));
            frame.pack();
            frame.setVisible(true);
        });
    }

    private static class HistogramPanel extends JPanel {

        private final Map<String, Integer> data;

        public HistogramPanel(Map<String, Integer> data) {
            this.data = data;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int barWidth = 30;  // Ancho de las barras
            int spaceBetweenBars = 20;  // Espacio entre las barras
            int x = 50;  // Posición inicial en el eje x
            int maxHeight = 300;  // Altura máxima de las barras

            for (Entry<String, Integer> entry : data.entrySet()) {
                String label = entry.getKey();
                int value = entry.getValue();

                int barHeight = (int) ((double) value / getMaxValue(data) * maxHeight);

                g.setColor(Color.BLUE);
                g.fillRect(x, maxHeight - barHeight, barWidth, barHeight);
                g.setColor(Color.BLACK);
                g.drawRect(x, maxHeight - barHeight, barWidth, barHeight);

                g.drawString(label, x, maxHeight + 20);

                x += barWidth + spaceBetweenBars;
            }
        }

        private int getMaxValue(Map<String, Integer> data) {
            int maxValue = 0;
            for (int value : data.values()) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
        }
    }
}