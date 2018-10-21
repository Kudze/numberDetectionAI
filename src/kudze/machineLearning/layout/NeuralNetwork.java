package kudze.machineLearning.layout;

import kudze.machineLearning.layout.neuron.Neuron;
import kudze.machineLearning.layout.neuron.NeuronInterface;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class NeuralNetwork {

    private NeuralNetworkLayer[] layers;

    public NeuralNetwork(InputNetworkLayer input, NeuralNetworkLayer[] hiddenLayers, OutputNetworkLayer output) {
        layers = new NeuralNetworkLayer[hiddenLayers.length + 2];

        this.layers[0] = input;
        this.layers[hiddenLayers.length + 1] = output;

        System.arraycopy(hiddenLayers, 0, this.layers, 1, hiddenLayers.length);

        this.constructNeuronLinks();
    }

    private void constructNeuronLinks() {
        for(int i = 1; i < this.layers.length; i++) {
            for(int j = 0; j < this.layers[i].getNeurons().length; j++) {
                for (int k = 0; k < this.layers[i - 1].getNeurons().length; k++) {
                    Neuron neuron = (Neuron) this.layers[i].getNeurons()[j];
                    NeuronInterface parentNeuron = this.layers[i - 1].getNeurons()[k];

                    neuron.addInput(parentNeuron, (float) Math.random());
                }
            }
        }
    }

    public InputNetworkLayer getInputLayer() {
        return (InputNetworkLayer) this.layers[0];
    }

    public OutputNetworkLayer getOutputLayer() {
        return (OutputNetworkLayer) this.layers[this.layers.length - 1];
    }

    public NeuralNetworkLayer getLayer(int index) {
        return this.layers[index];
    }

    public int getLayerCount() {
        return this.layers.length;
    }

    public NeuralNetworkLayer getHiddenLayer(int index) {
        return this.layers[index + 1];
    }

    public int getHiddenLayerCount() {
        return this.layers.length - 2;
    }

}
