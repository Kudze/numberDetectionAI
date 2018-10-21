package kudze.machineLearning.layout;

import kudze.machineLearning.layout.neuron.PredefinedNeuron;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public abstract class InputNetworkLayer extends NeuralNetworkLayer {

    public InputNetworkLayer(PredefinedNeuron[] neurons) {
        super(neurons);
    }

    public abstract void feedInput();

}
