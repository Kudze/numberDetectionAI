package kudze.machineLearning.layout.neuron;

import java.util.ArrayList;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class BiasNeuron extends Neuron {

    private float bias;

    public BiasNeuron(float bias) {
        super();

        this.bias = bias;
    }

    public BiasNeuron(ArrayList<NeuronInput> neurons, float bias) {
        super(neurons);

        this.bias = bias;
    }

    @Override
    protected float calculateNeuronValue() {
        return super.calculateNeuronValue() + bias;
    }

    void setBias(float bias) {
        this.bias = bias;
    }

    float getBias() {
        return this.bias;
    }

}
