package kudze.machineLearning.layout;

import kudze.machineLearning.layout.neuron.Neuron;
import kudze.machineLearning.layout.neuron.NeuronInterface;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class NeuralNetworkLayer {

    private NeuronInterface[] neurons;

    public NeuralNetworkLayer(int size) {
        this.neurons = new NeuronInterface[size];

        for(int i = 0; i < size; i++)
            this.neurons[i] = new Neuron();

    }

    public NeuralNetworkLayer(NeuronInterface[] neurons) {
        this.neurons = neurons;
    }

    public NeuronInterface[] getNeurons() {
        return neurons;
    }

}
