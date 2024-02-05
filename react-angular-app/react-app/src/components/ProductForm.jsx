import { useEffect, useState } from "react";

const initialDataForm = {
    id: 0,
    name: '',
    description: '',
    price: '',
}

// eslint-disable-next-line react/prop-types
export const ProductForm = ({ productSelected, handlerAdd }) => {

    const [form, setForm] = useState(initialDataForm);
    const { id, name, description, price } = form;

    useEffect(() => {
        setForm(productSelected);
    }, [productSelected]);

    return (
        <>
            <form onSubmit={(event => {
                event.preventDefault();

                if (!name || !description || !price) {
                    alert('Debe completar los datos del formulario');
                    return;
                }

                // console.log(form);
                handlerAdd(form);
                setForm(initialDataForm);
            })}>
                <div>
                    <input className="form-control my-3 w-75" type="text" placeholder="Name" name="name" value={name} onChange={(event => setForm({
                        ...form, name: event.target.value
                    }))} />
                </div>
                <div>
                    <input className="form-control my-3 w-75" type="text" placeholder="Description" name="description" value={description} onChange={(event => setForm({
                        ...form, description: event.target.value
                    }))} />
                </div>
                <div>
                    <input className="form-control my-3 w-75" type="text" placeholder="Price" name="price" value={price} onChange={(event => setForm({
                        ...form, price: event.target.value
                    }))} />
                </div>
                <div>
                    <button type="submit" className="btn btn-primary">
                        {id > 0 ? 'update' : 'create'}
                    </button>
                </div>
            </form>
        </>
    )
};