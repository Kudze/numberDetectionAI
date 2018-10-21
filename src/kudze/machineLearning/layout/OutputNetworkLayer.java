package kudze.machineLearning.layout;

import kudze.machineLearning.layout.neuron.Neuron;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public abstract class OutputNetworkLayer extends NeuralNetworkLayer {

    public OutputNetworkLayer(int size) {
        super(size);
    }

    public OutputNetworkLayer(Neuron[] neurons) {
        super(neurons);
    }

    public abstract float calculateCost(InputNetworkLayer inputNetworkLayer);

}
