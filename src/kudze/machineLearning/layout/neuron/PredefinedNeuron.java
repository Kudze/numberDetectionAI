package kudze.machineLearning.layout.neuron;

import kudze.machineLearning.layout.neuron.NeuronInterface;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class PredefinedNeuron implements NeuronInterface {

    private float value;

    public PredefinedNeuron(float value) {
        this.value = value;
    }

    public float calculate() {
        return this.value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
