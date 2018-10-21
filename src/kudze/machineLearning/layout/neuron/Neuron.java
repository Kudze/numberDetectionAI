package kudze.machineLearning.layout.neuron;

import java.util.ArrayList;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class Neuron implements NeuronInterface{

    private ArrayList<NeuronInput> inputs;

    public Neuron() {
        this.inputs = new ArrayList<NeuronInput>();
    }

    public Neuron(ArrayList<NeuronInput> neurons) {
        this.inputs = neurons;
    }

    protected float calculateNeuronValue() {
        float result = 0;

        for(NeuronInput input : inputs)
            result += input.getWeight() * input.getNeuron().calculate();

        return result;
    }

    @Override
    public float calculate() {
        float res = this.calculateNeuronValue();

        //Sigmoid function. Because output needs to be from 0 to 1
        return 1 / (1 + (float) Math.pow(2.71828, res));
    }

    public int addInput(NeuronInterface neuron, float weigth) {
        return this.addInput(
                new NeuronInput(neuron, weigth)
        );
    }

    public int addInput(NeuronInput input) {
        this.inputs.add(
                input
        );

        return this.inputs.size() - 1;
    }

    public ArrayList<NeuronInput> getInputs() {
        return inputs;
    }
}
